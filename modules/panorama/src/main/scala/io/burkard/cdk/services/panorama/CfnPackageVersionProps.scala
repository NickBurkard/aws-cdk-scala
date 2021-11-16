package io.burkard.cdk.services.panorama

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPackageVersionProps {

  def apply(
    packageVersion: String,
    packageId: String,
    patchVersion: String,
    markLatest: Option[Boolean] = None,
    ownerAccount: Option[String] = None,
    updatedLatestPatchVersion: Option[String] = None
  ): software.amazon.awscdk.services.panorama.CfnPackageVersionProps =
    (new software.amazon.awscdk.services.panorama.CfnPackageVersionProps.Builder)
      .packageVersion(packageVersion)
      .packageId(packageId)
      .patchVersion(patchVersion)
      .markLatest(markLatest.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ownerAccount(ownerAccount.orNull)
      .updatedLatestPatchVersion(updatedLatestPatchVersion.orNull)
      .build()
}
