package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ec2ConfigProperty {

  def apply(
    subnetArn: String,
    securityGroupArns: List[String]
  ): software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty =
    (new software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty.Builder)
      .subnetArn(subnetArn)
      .securityGroupArns(securityGroupArns.asJava)
      .build()
}
