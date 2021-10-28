package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationKeyFilter {

  def apply(
    prefix: Option[String] = None,
    suffix: Option[String] = None
  ): software.amazon.awscdk.services.s3.NotificationKeyFilter =
    (new software.amazon.awscdk.services.s3.NotificationKeyFilter.Builder)
      .prefix(prefix.orNull)
      .suffix(suffix.orNull)
      .build()
}
