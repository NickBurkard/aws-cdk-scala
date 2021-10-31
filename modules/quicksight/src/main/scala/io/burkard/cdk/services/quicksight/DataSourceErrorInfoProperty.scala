package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataSourceErrorInfoProperty {

  def apply(
    message: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty.Builder)
      .message(message.orNull)
      .`type`(`type`.orNull)
      .build()
}
