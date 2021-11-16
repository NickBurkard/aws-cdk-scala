package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransitionProperty {

  def apply(
    storageClass: String,
    transitionInDays: Option[Number] = None,
    transitionDate: Option[java.time.Instant] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder)
      .storageClass(storageClass)
      .transitionInDays(transitionInDays.orNull)
      .transitionDate(transitionDate.orNull)
      .build()
}
