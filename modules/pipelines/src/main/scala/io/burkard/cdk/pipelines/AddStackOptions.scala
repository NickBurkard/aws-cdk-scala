package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddStackOptions {

  def apply(
    runOrder: Option[Number] = None,
    executeRunOrder: Option[Number] = None
  ): software.amazon.awscdk.pipelines.AddStackOptions =
    (new software.amazon.awscdk.pipelines.AddStackOptions.Builder)
      .runOrder(runOrder.orNull)
      .executeRunOrder(executeRunOrder.orNull)
      .build()
}
