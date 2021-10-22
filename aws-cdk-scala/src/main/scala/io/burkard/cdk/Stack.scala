package io.burkard.cdk

import software.amazon.awscdk.StackProps

/**
 * CDK stack.
 * @param id Optional stack ID.
 * @param props Optional stack properties.
 * @param appCtx CDK app context.
 */
abstract class Stack(
  id: Option[String] = None,
  props: Option[StackProps] = None
)(implicit
  appCtx: CdkApp
) extends CdkStack(appCtx, id.orNull, props.orNull)  {

  // Context for initializing stack resources.
  protected[this] implicit lazy val stackCtx: CdkStack = this
}

object Stack {

  /**
   * Create an anonymous instance of a custom stack.
   * @param id Optional stack ID.
   * @param props Optional stack properties.
   * @param resources Function for initializing stack resources.
   * @param appCtx CDK app context.
   * @tparam A Result of initializing stack resources.
   * @return CDK stack.
   */
  def apply[A](
    id: Option[String] = None,
    props: Option[StackProps] = None
  )(
    resources: CdkStack => A
  )(implicit appCtx: CdkApp): Stack =
    new Stack(id, props) { ValueDiscard[A](resources(stackCtx)) }
}