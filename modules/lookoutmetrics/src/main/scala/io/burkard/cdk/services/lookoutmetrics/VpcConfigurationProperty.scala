package io.burkard.cdk.services.lookoutmetrics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcConfigurationProperty {

  def apply(
    securityGroupIdList: Option[List[String]] = None,
    subnetIdList: Option[List[String]] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty.Builder)
      .securityGroupIdList(securityGroupIdList.map(_.asJava).orNull)
      .subnetIdList(subnetIdList.map(_.asJava).orNull)
      .build()
}
