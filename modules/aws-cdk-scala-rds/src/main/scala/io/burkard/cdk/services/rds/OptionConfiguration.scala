package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OptionConfiguration {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None,
    port: Option[Number] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    settings: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.rds.OptionConfiguration =
    (new software.amazon.awscdk.services.rds.OptionConfiguration.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .port(port.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .settings(settings.map(_.asJava).orNull)
      .build()
}
