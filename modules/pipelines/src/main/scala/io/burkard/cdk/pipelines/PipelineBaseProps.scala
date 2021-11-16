package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PipelineBaseProps {

  def apply(
    synth: software.amazon.awscdk.pipelines.IFileSetProducer
  ): software.amazon.awscdk.pipelines.PipelineBaseProps =
    (new software.amazon.awscdk.pipelines.PipelineBaseProps.Builder)
      .synth(synth)
      .build()
}
