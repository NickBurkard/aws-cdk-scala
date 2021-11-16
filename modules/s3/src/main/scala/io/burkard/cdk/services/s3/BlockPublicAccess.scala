package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlockPublicAccess {

  def apply(
    blockPublicPolicy: Boolean,
    ignorePublicAcls: Boolean,
    blockPublicAcls: Boolean,
    restrictPublicBuckets: Boolean
  ): software.amazon.awscdk.services.s3.BlockPublicAccess =
    software.amazon.awscdk.services.s3.BlockPublicAccess.Builder
      .create()
      .blockPublicPolicy(blockPublicPolicy)
      .ignorePublicAcls(ignorePublicAcls)
      .blockPublicAcls(blockPublicAcls)
      .restrictPublicBuckets(restrictPublicBuckets)
      .build()
}
