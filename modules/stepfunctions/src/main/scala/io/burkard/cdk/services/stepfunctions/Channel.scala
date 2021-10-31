package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Channel {

  def apply(
    channelName: Option[String] = None,
    dataSource: Option[software.amazon.awscdk.services.stepfunctions.tasks.DataSource] = None,
    contentType: Option[String] = None,
    shuffleConfig: Option[software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig] = None,
    recordWrapperType: Option[software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType] = None,
    inputMode: Option[software.amazon.awscdk.services.stepfunctions.tasks.InputMode] = None,
    compressionType: Option[software.amazon.awscdk.services.stepfunctions.tasks.CompressionType] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.Channel =
    (new software.amazon.awscdk.services.stepfunctions.tasks.Channel.Builder)
      .channelName(channelName.orNull)
      .dataSource(dataSource.orNull)
      .contentType(contentType.orNull)
      .shuffleConfig(shuffleConfig.orNull)
      .recordWrapperType(recordWrapperType.orNull)
      .inputMode(inputMode.orNull)
      .compressionType(compressionType.orNull)
      .build()
}
