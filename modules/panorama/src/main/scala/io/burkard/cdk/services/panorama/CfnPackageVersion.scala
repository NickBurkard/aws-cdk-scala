package io.burkard.cdk.services.panorama

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPackageVersion {

  def apply(
    internalResourceId: String,
    packageVersion: Option[String] = None,
    markLatest: Option[Boolean] = None,
    ownerAccount: Option[String] = None,
    packageId: Option[String] = None,
    patchVersion: Option[String] = None,
    updatedLatestPatchVersion: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.panorama.CfnPackageVersion =
    software.amazon.awscdk.services.panorama.CfnPackageVersion.Builder
      .create(stackCtx, internalResourceId)
      .packageVersion(packageVersion.orNull)
      .markLatest(markLatest.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ownerAccount(ownerAccount.orNull)
      .packageId(packageId.orNull)
      .patchVersion(patchVersion.orNull)
      .updatedLatestPatchVersion(updatedLatestPatchVersion.orNull)
      .build()
}
