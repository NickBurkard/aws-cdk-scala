package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PipelineBaseProps {

  def apply(
    synth: Option[software.amazon.awscdk.pipelines.IFileSetProducer] = None
  ): software.amazon.awscdk.pipelines.PipelineBaseProps =
    (new software.amazon.awscdk.pipelines.PipelineBaseProps.Builder)
      .synth(synth.orNull)
      .build()
}
