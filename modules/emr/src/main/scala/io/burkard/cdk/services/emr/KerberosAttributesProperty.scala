package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KerberosAttributesProperty {

  def apply(
    adDomainJoinUser: Option[String] = None,
    crossRealmTrustPrincipalPassword: Option[String] = None,
    realm: Option[String] = None,
    adDomainJoinPassword: Option[String] = None,
    kdcAdminPassword: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder)
      .adDomainJoinUser(adDomainJoinUser.orNull)
      .crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword.orNull)
      .realm(realm.orNull)
      .adDomainJoinPassword(adDomainJoinPassword.orNull)
      .kdcAdminPassword(kdcAdminPassword.orNull)
      .build()
}
