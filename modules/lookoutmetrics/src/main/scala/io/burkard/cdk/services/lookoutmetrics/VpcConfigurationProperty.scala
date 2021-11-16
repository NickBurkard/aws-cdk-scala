package io.burkard.cdk.services.lookoutmetrics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcConfigurationProperty {

  def apply(
    securityGroupIdList: List[String],
    subnetIdList: List[String]
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty.Builder)
      .securityGroupIdList(securityGroupIdList.asJava)
      .subnetIdList(subnetIdList.asJava)
      .build()
}
