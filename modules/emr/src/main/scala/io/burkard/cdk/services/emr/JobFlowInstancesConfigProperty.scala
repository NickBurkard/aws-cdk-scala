package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JobFlowInstancesConfigProperty {

  def apply(
    ec2SubnetIds: Option[List[String]] = None,
    ec2KeyName: Option[String] = None,
    ec2SubnetId: Option[String] = None,
    emrManagedSlaveSecurityGroup: Option[String] = None,
    keepJobFlowAliveWhenNoSteps: Option[Boolean] = None,
    masterInstanceFleet: Option[software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty] = None,
    placement: Option[software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty] = None,
    hadoopVersion: Option[String] = None,
    masterInstanceGroup: Option[software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty] = None,
    additionalSlaveSecurityGroups: Option[List[String]] = None,
    emrManagedMasterSecurityGroup: Option[String] = None,
    additionalMasterSecurityGroups: Option[List[String]] = None,
    serviceAccessSecurityGroup: Option[String] = None,
    coreInstanceGroup: Option[software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty] = None,
    terminationProtected: Option[Boolean] = None,
    coreInstanceFleet: Option[software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetConfigProperty] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.JobFlowInstancesConfigProperty.Builder)
      .ec2SubnetIds(ec2SubnetIds.map(_.asJava).orNull)
      .ec2KeyName(ec2KeyName.orNull)
      .ec2SubnetId(ec2SubnetId.orNull)
      .emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup.orNull)
      .keepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .masterInstanceFleet(masterInstanceFleet.orNull)
      .placement(placement.orNull)
      .hadoopVersion(hadoopVersion.orNull)
      .masterInstanceGroup(masterInstanceGroup.orNull)
      .additionalSlaveSecurityGroups(additionalSlaveSecurityGroups.map(_.asJava).orNull)
      .emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup.orNull)
      .additionalMasterSecurityGroups(additionalMasterSecurityGroups.map(_.asJava).orNull)
      .serviceAccessSecurityGroup(serviceAccessSecurityGroup.orNull)
      .coreInstanceGroup(coreInstanceGroup.orNull)
      .terminationProtected(terminationProtected.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .coreInstanceFleet(coreInstanceFleet.orNull)
      .build()
}
