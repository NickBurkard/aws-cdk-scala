package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
