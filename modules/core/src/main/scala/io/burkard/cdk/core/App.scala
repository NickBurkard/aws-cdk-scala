package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object App {

  def apply(
    treeMetadata: Option[Boolean] = None,
    context: Option[Map[String, _]] = None,
    outdir: Option[String] = None,
    runtimeInfo: Option[Boolean] = None,
    autoSynth: Option[Boolean] = None,
    analyticsReporting: Option[Boolean] = None,
    stackTraces: Option[Boolean] = None
  ): software.amazon.awscdk.App =
    software.amazon.awscdk.App.Builder
      .create()
      .treeMetadata(treeMetadata.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .context(context.map(_.asJava).orNull)
      .outdir(outdir.orNull)
      .runtimeInfo(runtimeInfo.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .autoSynth(autoSynth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .analyticsReporting(analyticsReporting.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stackTraces(stackTraces.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
