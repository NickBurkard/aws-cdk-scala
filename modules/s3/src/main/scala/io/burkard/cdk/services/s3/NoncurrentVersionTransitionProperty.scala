package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NoncurrentVersionTransitionProperty {

  def apply(
    transitionInDays: Number,
    storageClass: String
  ): software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.Builder)
      .transitionInDays(transitionInDays)
      .storageClass(storageClass)
      .build()
}
