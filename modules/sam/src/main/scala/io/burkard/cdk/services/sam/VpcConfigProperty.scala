package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcConfigProperty {

  def apply(
    subnetIds: List[String],
    securityGroupIds: List[String]
  ): software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty.Builder)
      .subnetIds(subnetIds.asJava)
      .securityGroupIds(securityGroupIds.asJava)
      .build()
}
