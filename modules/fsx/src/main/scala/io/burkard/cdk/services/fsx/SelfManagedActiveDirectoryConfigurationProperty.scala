package io.burkard.cdk.services.fsx

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
