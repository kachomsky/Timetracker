package timetracker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public abstract class Report implements Visitor {

	/** 
	 * @uml.property name="project"
	 * @uml.associationEnd multiplicity="(1 1)" 
	 * 		inverse="reports:timetracker.Project"
	 */
	private Project project = null;

	/**
	 * @uml.property  name="format"
	 * @uml.associationEnd  multiplicity="(1 1)" 
	 * 		inverse="report:timetracker.Format"
	 */
	private Format format = null;

	/**
	 * Getter of the property <tt>format</tt>
	 * @return  Returns the format.
	 * @uml.property  name="format"
	 */
	public final Format getFormat() {
		return this.format;
	}

	/**
	 * Setter of the property <tt>format</tt>
	 * @param format  The format to set.
	 * @uml.property  name="format"
	 */
	public final void setFormat(final Format formatSet) {
		this.format = formatSet;
	}

	/** 
	 * @uml.property name="elements"
	 * @uml.associationEnd multiplicity="(1 -1)" aggregation="shared" 
	 * 		inverse="report:timetracker.Element"
	 */
	private Collection<Element> elements = new ArrayList<Element>();

	/**
	 * Getter of the property <tt>elements</tt>
	 * @return  Returns the elements.
	 * @uml.property  name="elements"
	 */
	public final Collection<Element> getElements() {
		return this.elements;
	}

	/**
	 * Setter of the property <tt>elements</tt>
	 * @param elements  The elements to set.
	 * @uml.property  name="elements"
	 */
	public final void setElements(final Collection<Element> elementsSet) {
		this.elements = elementsSet;
	}
	
	public abstract void visitInterval(Interval interval, int level);
	
	public abstract void visitTask(Task task, int level);
	
	public abstract void visitProject(Project projectVisited, int level);

	public final long calculateIntersectionTime(final Activity activity) {
		return 0;
		
	}

	/**
	 * @uml.property  name="startDate"
	 */
	private Date startDate;

	/**
	 * Getter of the property <tt>startDate</tt>
	 * @return  Returns the startDate.
	 * @uml.property  name="startDate"
	 */
	public final Date getStartDate() {
		return startDate;
	}

	/**
	 * Setter of the property <tt>startDate</tt>
	 * @param startDate  The startDate to set.
	 * @uml.property  name="startDate"
	 */
	public final void setStartDate(final Date startDateSet) {
		this.startDate = startDateSet;
	}

	/**
	 * @uml.property  name="endDate"
	 */
	private Date endDate;

	/**
	 * Getter of the property <tt>endDate</tt>
	 * @return  Returns the endDate.
	 * @uml.property  name="endDate"
	 */
	public final Date getEndDate() {
		return endDate;
	}

	/**
	 * Setter of the property <tt>endDate</tt>
	 * @param endDate  The endDate to set.
	 * @uml.property  name="endDate"
	 */
	public final void setEndDate(final Date endDateSet) {
		this.endDate = endDateSet;
	}

	/**
	 * Getter of the property <tt>project</tt>
	 * @return  Returns the projects.
	 * @uml.property  name="project"
	 */
	public final Project getProject() {
		return this.project;
	}

	/**
	 * Setter of the property <tt>project</tt>
	 * @param project  The projects to set.
	 * @uml.property  name="project"
	 */
	public final void setProject(final Project projectSet) {
		this.project = projectSet;
	}

}