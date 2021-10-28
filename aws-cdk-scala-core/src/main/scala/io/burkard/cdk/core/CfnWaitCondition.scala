package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWaitCondition {

  def apply(
    internalResourceId: String,
    count: Option[Number] = None,
    timeout: Option[String] = None,
    handle: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnWaitCondition =
    software.amazon.awscdk.CfnWaitCondition.Builder
      .create(stackCtx, internalResourceId)
      .count(count.orNull)
      .timeout(timeout.orNull)
      .handle(handle.orNull)
      .build()
}
