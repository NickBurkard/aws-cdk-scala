package io.burkard.cdk.services.amplify

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubDomainSettingProperty {

  def apply(
    prefix: Option[String] = None,
    branchName: Option[String] = None
  ): software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty =
    (new software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty.Builder)
      .prefix(prefix.orNull)
      .branchName(branchName.orNull)
      .build()
}
