package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Transition {

  def apply(
    storageClass: software.amazon.awscdk.services.s3.StorageClass,
    transitionAfter: Option[software.amazon.awscdk.Duration] = None,
    transitionDate: Option[java.time.Instant] = None
  ): software.amazon.awscdk.services.s3.Transition =
    (new software.amazon.awscdk.services.s3.Transition.Builder)
      .storageClass(storageClass)
      .transitionAfter(transitionAfter.orNull)
      .transitionDate(transitionDate.orNull)
      .build()
}
