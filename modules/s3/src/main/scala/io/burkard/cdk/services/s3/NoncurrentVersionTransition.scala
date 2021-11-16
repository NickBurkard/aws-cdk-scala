package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NoncurrentVersionTransition {

  def apply(
    transitionAfter: software.amazon.awscdk.Duration,
    storageClass: software.amazon.awscdk.services.s3.StorageClass
  ): software.amazon.awscdk.services.s3.NoncurrentVersionTransition =
    (new software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder)
      .transitionAfter(transitionAfter)
      .storageClass(storageClass)
      .build()
}
