package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EbsConfigurationProperty {

  def apply(
    ebsOptimized: Option[Boolean] = None,
    ebsBlockDeviceConfigs: Option[List[_]] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty.Builder)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.map(_.asJava).orNull)
      .build()
}
