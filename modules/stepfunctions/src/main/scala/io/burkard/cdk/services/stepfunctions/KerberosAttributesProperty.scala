package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KerberosAttributesProperty {

  def apply(
    adDomainJoinUser: Option[String] = None,
    crossRealmTrustPrincipalPassword: Option[String] = None,
    realm: Option[String] = None,
    adDomainJoinPassword: Option[String] = None,
    kdcAdminPassword: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty.Builder)
      .adDomainJoinUser(adDomainJoinUser.orNull)
      .crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword.orNull)
      .realm(realm.orNull)
      .adDomainJoinPassword(adDomainJoinPassword.orNull)
      .kdcAdminPassword(kdcAdminPassword.orNull)
      .build()
}
