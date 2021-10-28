package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TransitionProperty {

  def apply(
    transitionInDays: Option[Number] = None,
    storageClass: Option[String] = None,
    transitionDate: Option[java.time.Instant] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder)
      .transitionInDays(transitionInDays.orNull)
      .storageClass(storageClass.orNull)
      .transitionDate(transitionDate.orNull)
      .build()
}
