package io.burkard.cdk.services.amplify

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubDomainSettingProperty {

  def apply(
    prefix: String,
    branchName: String
  ): software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty =
    (new software.amazon.awscdk.services.amplify.CfnDomain.SubDomainSettingProperty.Builder)
      .prefix(prefix)
      .branchName(branchName)
      .build()
}
