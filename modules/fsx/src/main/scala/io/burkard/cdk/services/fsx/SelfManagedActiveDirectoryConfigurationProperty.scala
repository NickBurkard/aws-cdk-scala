package io.burkard.cdk.services.fsx

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SelfManagedActiveDirectoryConfigurationProperty {

  def apply(
    organizationalUnitDistinguishedName: Option[String] = None,
    domainName: Option[String] = None,
    fileSystemAdministratorsGroup: Option[String] = None,
    password: Option[String] = None,
    userName: Option[String] = None,
    dnsIps: Option[List[String]] = None
  ): software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty =
    (new software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty.Builder)
      .organizationalUnitDistinguishedName(organizationalUnitDistinguishedName.orNull)
      .domainName(domainName.orNull)
      .fileSystemAdministratorsGroup(fileSystemAdministratorsGroup.orNull)
      .password(password.orNull)
      .userName(userName.orNull)
      .dnsIps(dnsIps.map(_.asJava).orNull)
      .build()
}
