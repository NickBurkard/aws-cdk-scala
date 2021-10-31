package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDHCPOptionsProps {

  def apply(
    netbiosNodeType: Option[Number] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    netbiosNameServers: Option[List[String]] = None,
    domainName: Option[String] = None,
    ntpServers: Option[List[String]] = None,
    domainNameServers: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps =
    (new software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps.Builder)
      .netbiosNodeType(netbiosNodeType.orNull)
      .tags(tags.map(_.asJava).orNull)
      .netbiosNameServers(netbiosNameServers.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .ntpServers(ntpServers.map(_.asJava).orNull)
      .domainNameServers(domainNameServers.map(_.asJava).orNull)
      .build()
}
