package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
