package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstancesConfigProperty {

  def apply(
    ec2SubnetIds: Option[List[String]] = None,
    ec2KeyName: Option[String] = None,
    ec2SubnetId: Option[String] = None,
    emrManagedSlaveSecurityGroup: Option[String] = None,
    slaveInstanceType: Option[String] = None,
    placement: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty] = None,
    serviceAccessSecurityGroup: Option[String] = None,
    instanceFleets: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty]] = None,
    additionalSlaveSecurityGroups: Option[List[String]] = None,
    emrManagedMasterSecurityGroup: Option[String] = None,
    masterInstanceType: Option[String] = None,
    additionalMasterSecurityGroups: Option[List[String]] = None,
    instanceCount: Option[Number] = None,
    hadoopVersion: Option[String] = None,
    instanceGroups: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty]] = None,
    terminationProtected: Option[Boolean] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty.Builder)
      .ec2SubnetIds(ec2SubnetIds.map(_.asJava).orNull)
      .ec2KeyName(ec2KeyName.orNull)
      .ec2SubnetId(ec2SubnetId.orNull)
      .emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup.orNull)
      .slaveInstanceType(slaveInstanceType.orNull)
      .placement(placement.orNull)
      .serviceAccessSecurityGroup(serviceAccessSecurityGroup.orNull)
      .instanceFleets(instanceFleets.map(_.asJava).orNull)
      .additionalSlaveSecurityGroups(additionalSlaveSecurityGroups.map(_.asJava).orNull)
      .emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup.orNull)
      .masterInstanceType(masterInstanceType.orNull)
      .additionalMasterSecurityGroups(additionalMasterSecurityGroups.map(_.asJava).orNull)
      .instanceCount(instanceCount.orNull)
      .hadoopVersion(hadoopVersion.orNull)
      .instanceGroups(instanceGroups.map(_.asJava).orNull)
      .terminationProtected(terminationProtected.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
