package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EbsConfigurationProperty {

  def apply(
    ebsOptimized: Option[Boolean] = None,
    ebsBlockDeviceConfigs: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty.Builder)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.map(_.asJava).orNull)
      .build()
}
