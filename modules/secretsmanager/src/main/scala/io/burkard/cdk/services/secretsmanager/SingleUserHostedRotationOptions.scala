package io.burkard.cdk.services.secretsmanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SingleUserHostedRotationOptions {

  def apply(
    functionName: Option[String] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions =
    (new software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions.Builder)
      .functionName(functionName.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .build()
}
