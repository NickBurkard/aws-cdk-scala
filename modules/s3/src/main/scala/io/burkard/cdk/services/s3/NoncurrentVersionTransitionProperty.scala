package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NoncurrentVersionTransitionProperty {

  def apply(
    transitionInDays: Option[Number] = None,
    storageClass: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.Builder)
      .transitionInDays(transitionInDays.orNull)
      .storageClass(storageClass.orNull)
      .build()
}
