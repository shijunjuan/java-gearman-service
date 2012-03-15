package org.gearman;

import java.io.Serializable;

/**
 * An object used to 
 * @author isaiah
 */
public interface GearmanPersistable extends GearmanJob, Serializable {
	
	/**
	 * The job handle defined by the gearman server
	 * @return
	 * 		The job handle
	 */
	public byte[] getJobHandle();
	
	/**
	 * The unique id defined by the client to identify jobs within a function
	 * @return
	 * 		The unique id
	 */
	public byte[] getUniqueID();
	
	/**
	 * Returns the epoch time for when this job can execute. The given job will not be sent
	 * to a worker until after the epoch time has elapsed 
	 * @return
	 * 		The epoch time for when this job may run
	 */
	public long epochTime();
	
	/**
	 * Returns the job's priority level
	 * @return
	 * 		The job's priority level
	 */
	public GearmanJobPriority getPriority();
}