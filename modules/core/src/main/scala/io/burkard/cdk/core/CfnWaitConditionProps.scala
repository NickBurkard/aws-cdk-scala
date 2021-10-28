package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWaitConditionProps {

  def apply(
    count: Option[Number] = None,
    timeout: Option[String] = None,
    handle: Option[String] = None
  ): software.amazon.awscdk.CfnWaitConditionProps =
    (new software.amazon.awscdk.CfnWaitConditionProps.Builder)
      .count(count.orNull)
      .timeout(timeout.orNull)
      .handle(handle.orNull)
      .build()
}
