package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceGroupModifyConfigProperty {

  def apply(
    shrinkPolicy: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty] = None,
    eC2InstanceIdsToTerminate: Option[List[String]] = None,
    instanceCount: Option[Number] = None,
    configurations: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.Builder)
      .shrinkPolicy(shrinkPolicy.orNull)
      .eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate.map(_.asJava).orNull)
      .instanceCount(instanceCount.orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .build()
}
