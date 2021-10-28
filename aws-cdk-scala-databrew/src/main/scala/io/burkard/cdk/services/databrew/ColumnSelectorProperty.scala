package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ColumnSelectorProperty {

  def apply(
    regex: Option[String] = None,
    name: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty.Builder)
      .regex(regex.orNull)
      .name(name.orNull)
      .build()
}
