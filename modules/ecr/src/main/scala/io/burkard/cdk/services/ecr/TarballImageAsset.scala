package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TarballImageAsset {

  def apply(
    internalResourceId: String,
    tarballFile: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecr.assets.TarballImageAsset =
    software.amazon.awscdk.services.ecr.assets.TarballImageAsset.Builder
      .create(stackCtx, internalResourceId)
      .tarballFile(tarballFile.orNull)
      .build()
}
