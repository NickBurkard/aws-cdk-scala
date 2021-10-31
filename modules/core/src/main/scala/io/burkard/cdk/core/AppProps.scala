package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AppProps {

  def apply(
    treeMetadata: Option[Boolean] = None,
    context: Option[Map[String, _]] = None,
    outdir: Option[String] = None,
    autoSynth: Option[Boolean] = None,
    analyticsReporting: Option[Boolean] = None,
    stackTraces: Option[Boolean] = None
  ): software.amazon.awscdk.AppProps =
    (new software.amazon.awscdk.AppProps.Builder)
      .treeMetadata(treeMetadata.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .context(context.map(_.asJava).orNull)
      .outdir(outdir.orNull)
      .autoSynth(autoSynth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .analyticsReporting(analyticsReporting.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stackTraces(stackTraces.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
