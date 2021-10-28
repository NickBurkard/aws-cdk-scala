package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddHeader {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.ses.actions.AddHeader =
    software.amazon.awscdk.services.ses.actions.AddHeader.Builder
      .create()
      .name(name.orNull)
      .value(value.orNull)
      .build()
}