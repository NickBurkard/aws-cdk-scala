package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDHCPOptions {

  def apply(
    internalResourceId: String,
    netbiosNodeType: Option[Number] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    netbiosNameServers: Option[List[String]] = None,
    domainName: Option[String] = None,
    ntpServers: Option[List[String]] = None,
    domainNameServers: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnDHCPOptions =
    software.amazon.awscdk.services.ec2.CfnDHCPOptions.Builder
      .create(stackCtx, internalResourceId)
      .netbiosNodeType(netbiosNodeType.orNull)
      .tags(tags.map(_.asJava).orNull)
      .netbiosNameServers(netbiosNameServers.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .ntpServers(ntpServers.map(_.asJava).orNull)
      .domainNameServers(domainNameServers.map(_.asJava).orNull)
      .build()
}
