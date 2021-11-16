package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KerberosAttributesProperty {

  def apply(
    realm: String,
    adDomainJoinUser: Option[String] = None,
    crossRealmTrustPrincipalPassword: Option[String] = None,
    adDomainJoinPassword: Option[String] = None,
    kdcAdminPassword: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty.Builder)
      .realm(realm)
      .adDomainJoinUser(adDomainJoinUser.orNull)
      .crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword.orNull)
      .adDomainJoinPassword(adDomainJoinPassword.orNull)
      .kdcAdminPassword(kdcAdminPassword.orNull)
      .build()
}
