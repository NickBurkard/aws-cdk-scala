package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KerberosAttributesProperty {

  def apply(
    realm: String,
    kdcAdminPassword: String,
    adDomainJoinUser: Option[String] = None,
    crossRealmTrustPrincipalPassword: Option[String] = None,
    adDomainJoinPassword: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.KerberosAttributesProperty.Builder)
      .realm(realm)
      .kdcAdminPassword(kdcAdminPassword)
      .adDomainJoinUser(adDomainJoinUser.orNull)
      .crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword.orNull)
      .adDomainJoinPassword(adDomainJoinPassword.orNull)
      .build()
}
