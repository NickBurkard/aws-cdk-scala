package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Ec2ConfigProperty {

  def apply(
    subnetArn: Option[String] = None,
    securityGroupArns: Option[List[String]] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty =
    (new software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty.Builder)
      .subnetArn(subnetArn.orNull)
      .securityGroupArns(securityGroupArns.map(_.asJava).orNull)
      .build()
}
