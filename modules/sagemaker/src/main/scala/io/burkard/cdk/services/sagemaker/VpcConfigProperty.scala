package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcConfigProperty {

  def apply(
    subnets: Option[List[String]] = None,
    securityGroupIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.VpcConfigProperty.Builder)
      .subnets(subnets.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}
