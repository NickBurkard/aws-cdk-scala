package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ColumnProperty {

  def apply(
    name: String,
    `type`: String
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty.Builder)
      .name(name)
      .`type`(`type`)
      .build()
}
