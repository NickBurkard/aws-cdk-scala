package io.burkard.cdk.services.panorama

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPackageVersion {

  def apply(
    internalResourceId: String,
    packageVersion: String,
    packageId: String,
    patchVersion: String,
    markLatest: Option[Boolean] = None,
    ownerAccount: Option[String] = None,
    updatedLatestPatchVersion: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.panorama.CfnPackageVersion =
    software.amazon.awscdk.services.panorama.CfnPackageVersion.Builder
      .create(stackCtx, internalResourceId)
      .packageVersion(packageVersion)
      .packageId(packageId)
      .patchVersion(patchVersion)
      .markLatest(markLatest.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ownerAccount(ownerAccount.orNull)
      .updatedLatestPatchVersion(updatedLatestPatchVersion.orNull)
      .build()
}
