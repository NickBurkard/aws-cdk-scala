package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManualApprovalStepProps {

  def apply(
    comment: Option[String] = None
  ): software.amazon.awscdk.pipelines.ManualApprovalStepProps =
    (new software.amazon.awscdk.pipelines.ManualApprovalStepProps.Builder)
      .comment(comment.orNull)
      .build()
}
