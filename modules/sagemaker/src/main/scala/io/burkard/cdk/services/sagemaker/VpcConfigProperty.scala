package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcConfigProperty {

  def apply(
    subnets: List[String],
    securityGroupIds: List[String]
  ): software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty.Builder)
      .subnets(subnets.asJava)
      .securityGroupIds(securityGroupIds.asJava)
      .build()
}
