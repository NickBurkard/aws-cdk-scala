package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Transition {

  def apply(
    transitionAfter: Option[software.amazon.awscdk.Duration] = None,
    storageClass: Option[software.amazon.awscdk.services.s3.StorageClass] = None,
    transitionDate: Option[java.time.Instant] = None
  ): software.amazon.awscdk.services.s3.Transition =
    (new software.amazon.awscdk.services.s3.Transition.Builder)
      .transitionAfter(transitionAfter.orNull)
      .storageClass(storageClass.orNull)
      .transitionDate(transitionDate.orNull)
      .build()
}
